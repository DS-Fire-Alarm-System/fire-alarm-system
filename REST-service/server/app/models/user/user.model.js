import mongoose from 'mongoose';

// User model
const UserSchema = mongoose.Schema({
    first_name: {
        type: String,
        trim: true,
        required: "First Name is required"
    },
    last_name: {
        type: String,
        trim: true,
        required: "Last Name is required"
    },
    email: {
        type: String,
        trim: true,
        unique: 'Email already exists',
        match: [/.+\@.+\..+/, 'Please fill a valid email address'],
        required: 'Email is required'
    },
    password: {
        type: String,
        required: "Password is required"
    },
    created_at: {
        type: Date,
        default: Date.now
    },
    updated_at: Date
});

export default mongoose.model('User', UserSchema);
