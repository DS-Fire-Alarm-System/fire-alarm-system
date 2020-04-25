import express from "express";
import authCtrl from "../../controllers/auth/auth.controller";


const router = express.Router();

router.route('/')
    .post(authCtrl.signIn);

export default router;
