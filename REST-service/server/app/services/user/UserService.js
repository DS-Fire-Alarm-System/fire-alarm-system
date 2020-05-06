import { BaseService } from "../BaseService";
import User from "../../models/user/user.model";
import bcrypt from "bcrypt";

// User service class
class UserService extends BaseService {
    constructor() {
        super(User);
    }

    // Check user whether the user in the database (cb means callback function)
    checkUser = (userObject, cb) => {
        try {
            this.findOne(userObject, (err, result) => {
                if (err) {
                    return cb(err);
                } else {
                    if (result) {
                        cb(null, result);
                    } else {
                        cb("Unauthorized");
                    }
                }
            })
        } catch (err) {
            return cb(err);
        }
    };

    // Authentication function (cb means callback function)
    authUser = (userObject, cb) => {
        this.checkUser({ email: userObject.username }, (err, result) => {
            if (err) {
                return cb(err);
            } else {
                // Comparing with bcrypt with user password
                if (bcrypt.compareSync(userObject.password, result.password) === true) {
                    return cb(null, true);
                } else {
                    return cb("Unauthorized");
                }
            }
        })
    };
}

export default new UserService();
