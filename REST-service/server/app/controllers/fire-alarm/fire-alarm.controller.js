import FireAlarmService from "../../services/fire-alarm/FireAlarmService";

// Creating a fire-alarm
const createFireAlarm = (req, res) => {
    const newFireAlarm = {
        floor_no: req.body.floor_no,
        room_no: req.body.room_no,
        smoke_level: req.body.smoke_level,
        co2_level: req.body.co2_level,
        status: req.body.status,
    };

    // Calling service method
    FireAlarmService.create(newFireAlarm, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(201).json({ status: "success", data: result });
    })
};

// Getting fire-alarm list
const getFireAlarmList = (req, res) => {
    // Calling service method
    FireAlarmService.find({}, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(200).json({ status: "success", data: result });
    })
};

// Get fire-alarm by id
const getFireAlarmById = (req, res) => {
    // Calling service method
    FireAlarmService.findOne({ _id: req.params.id }, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        }

        return res.status(200).json({ status: "success", data: result });
    })
};

// Update fire-alarm
const updateFireAlarm = (req, res) => {
    const updateFireAlarm = {
        floor_no: req.body.floor_no,
        room_no: req.body.room_no,
        smoke_level: req.body.smoke_level,
        co2_level: req.body.co2_level,
        status: req.body.status,
    };

    // Calling service method
    FireAlarmService.updateFireAlarm(updateFireAlarm, req.params.id, (err, result) => {
        if (err) {
            return res.status(400).json({ status: "error", data: {} });
        } else {
            return res.status(201).json({ status: "success", data: result });
        }
    })
};

// Delete fire-alarm
const deleteFireAlarm = (req, res) => {
    // Calling service method
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
