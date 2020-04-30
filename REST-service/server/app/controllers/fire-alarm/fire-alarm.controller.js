import FireAlarmService from "../../services/fire-alarm/FireAlarmService";


const createFireAlarm = (req, res) => {
    const newFireAlarm = {
        floor_no: req.body.floor_no,
        room_no: req.body.room_no,
        smoke_level: req.body.smoke_level,
        co2_level: req.body.co2_level,
        status: req.body.status,
    };

    FireAlarmService.create(newFireAlarm, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(201).json({ status: "success", data: result });
    })
};

const getFireAlarmList = (req, res) => {
    FireAlarmService.find({}, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(200).json({ status: "success", data: result });
    })
};

const getFireAlarmById = (req, res) => {
    FireAlarmService.findOne({ _id: req.params.id }, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(200).json({ status: "success", data: result });
    })
};

const updateFireAlarm = (req, res) => {
    const updateFireAlarm = {
        floor_no: req.body.floor_no,
        room_no: req.body.room_no,
        smoke_level: req.body.smoke_level,
        co2_level: req.body.co2_level,
        status: req.body.status,
    };

    FireAlarmService.updateFireAlarm(updateFireAlarm, req.params.id, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        } else {
            return res.status(201).json({ status: "success", data: result });
        }
    })
};

const deleteFireAlarm = (req, res) => {
    FireAlarmService.delete({ _id: req.params.id }, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(200).json({ status: "success", data: {} });
    })
};

export default {
    createFireAlarm,
    getFireAlarmById,
    getFireAlarmList,
    updateFireAlarm,
    deleteFireAlarm
}
