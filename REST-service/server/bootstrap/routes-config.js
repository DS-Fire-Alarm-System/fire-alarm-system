// Main Route Files
import app from './express-config';
import userRoutes from "../app/routes/user/user.routes";
import authRoutes from "../app/routes/auth/auth.routes";
import fireAlarmRoutes from "../app/routes/fire-alarm/fire-alarm.routes";
import emailRoutes from "../app/routes/email/email.routes";
import smsRoutes from "../app/routes/sms/sms.routes";


// Auth routes
app.use('/api/auth', authRoutes);

// User routes
app.use('/api/users', userRoutes);

// Fire-alarm routes
app.use('/api/fire-alarms', fireAlarmRoutes);

// Email routes
app.use('/api/emails', emailRoutes);

// SMS routes
app.use('/api/sms', smsRoutes);

// Web route
app.get('*', (req, res) => {
    res.status(200).send("Hello");
});

export default app;
