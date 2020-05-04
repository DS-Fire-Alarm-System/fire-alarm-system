import express from "express";
import smsCtrl from "../../controllers/sms/sms.controller";


const router = express.Router();

router.route('/')
    .post(smsCtrl.sendSMS);

export default router;
