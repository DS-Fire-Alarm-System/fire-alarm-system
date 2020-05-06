import express from "express";
import fireAlarmCtrl from "../../controllers/fire-alarm/fire-alarm.controller";

// Fire-alarm routes individually
const router = express.Router();

router.route('/')
    .post(fireAlarmCtrl.createFireAlarm)
    .get(fireAlarmCtrl.getFireAlarmList);

router.route('/:id')
    .get(fireAlarmCtrl.getFireAlarmById)
    .put(fireAlarmCtrl.updateFireAlarm)
    .delete(fireAlarmCtrl.deleteFireAlarm);

export default router;
