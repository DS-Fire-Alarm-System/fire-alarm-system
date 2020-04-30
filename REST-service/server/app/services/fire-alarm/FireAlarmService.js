import { BaseService } from "../BaseService";
import FireAlarm from "../../models/fire-alarm/fire-alarm.model";


class FireAlarmService extends BaseService {
    constructor() {
        super(FireAlarm);
    }

    updateFireAlarm(object, id, cb) {
        this.findOne({ _id: id }, (err, result) => {
            if (err) {
                cb(err);
            } else {
                if (result) {
                    const updatedObject = result;

                    if (object.floor_no !== undefined) {
                        updatedObject.floor_no = object.floor_no;
                    }

                    if (object.room_no !== undefined) {
                        updatedObject.room_no = object.room_no;
                    }

                    if (object.smoke_level !== undefined) {
                        updatedObject.smoke_level = object.smoke_level;
                    }

                    if (object.co2_level !== undefined) {
                        updatedObject.co2_level = object.co2_level;
                    }

                    if (object.status !== undefined) {
                        updatedObject.status = object.status;
                    }

                    updatedObject.updated_at = new Date();
                    updatedObject.save((err, result) => {
                        if (err) {
                            cb(err);
                        } else {
                            cb(null, result);
                        }
                    })
                }
            }
        })
    }
}

export default new FireAlarmService();
