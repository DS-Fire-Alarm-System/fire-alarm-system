import UserService from "../../services/user/UserService";
import bcrypt from "bcrypt";

// Registering a User
const createUser = (req, res) => {
    const newUser = {
        first_name: req.body.first_name,
        last_name: req.body.last_name,
        email: req.body.email,
        password: bcrypt.hashSync(req.body.password, 10)
    };

    // Calling service method
    UserService.create(newUser, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error" });
        }

        return res.status(201).json({ status: "success", data: result });
    })
};

export default {
    createUser
}
