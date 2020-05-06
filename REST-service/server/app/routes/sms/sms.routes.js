import express from "express";
import smsCtrl from "../../controllers/sms/sms.controller";

// Sms routes individually
const router = express.Router();

router.route('/')
    .post(smsCtrl.sendSMS);

export default router;
