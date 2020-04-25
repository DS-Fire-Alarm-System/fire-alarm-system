import express from "express";
import userCtrl from "../../controllers/user/user.controller";


const router = express.Router();

router.route('/')
      .post(userCtrl.createUser);

export default router;
