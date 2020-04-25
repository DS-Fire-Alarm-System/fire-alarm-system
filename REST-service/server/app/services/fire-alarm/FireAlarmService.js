import { BaseService } from "../BaseService";
import FireAlarm from "../../models/fire-alarm/fire-alarm.model";


class FireAlarmService extends BaseService {
    constructor() {
        super(FireAlarm);
    }
}

export default new FireAlarmService();
