import express from "express";
import userCtrl from "../../controllers/user/user.controller";

// User routes individually
const router = express.Router();

router.route('/')
      .post(userCtrl.createUser);

export default router;
