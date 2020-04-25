import app from './express-config';
import userRoutes from "../app/routes/user/user.routes";
import authRoutes from "../app/routes/auth/auth.routes";
import fireAlarmRoutes from "../app/routes/fire-alarm/fire-alarm.routes";


// Auth routes
app.use('/api/auth', authRoutes);

// User routes
app.use('/api/users', userRoutes);

// Fire-alarm routes
app.use('/api/fire-alarms', fireAlarmRoutes);

// Web route
app.get('*', (req, res) => {
    res.status(200).send("Hello");
});

export default app;
