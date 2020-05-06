import mongoose from 'mongoose';

// Fire-alarm model
const FireAlarmSchema = mongoose.Schema({
    floor_no: {
        type: Number,
        required: "Floor no is required"
    },
    room_no: {
        type: Number,
        required: "Room no is required"
    },
    smoke_level: {
        type: Number,
        min: 1,
        max: 10,
        default: 1
    },
    co2_level: {
        type: Number,
        min: 1,
        max: 10,
        default: 1
    },
    status: {
        type: Boolean,
        default: true
    },
    created_at: {
        type: Date,
        default: Date.now
    },
    updated_at: Date
});

export default mongoose.model('FireAlarm', FireAlarmSchema);
