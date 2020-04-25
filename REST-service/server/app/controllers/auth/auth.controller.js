import UserService from "../../services/user/UserService";


const signIn = (req, res) => {
    const userObject = {
        username: req.body.username,
        password: req.body.password
    };

    UserService.authUser(userObject, (err, user) => {
        if (err) {
            return res.status(400).json({ status: "error", message: "Unauthorized" });
        } else {
            return res.status(200).json({ status: "success", message: "Authorized" });
        }
    });
};

export default {
    signIn
}
