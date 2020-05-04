import express from "express";
import emailCtrl from "../../controllers/email/email.controller";


const router = express.Router();

router.route('/')
    .post(emailCtrl.sendEmail);

export default router;
