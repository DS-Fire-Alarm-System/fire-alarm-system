import mongoose from 'mongoose';
import app from './bootstrap/routes-config';
import { port, mongoUri } from "./config/core.config";


// Connect to MongoDB
mongoose.connect(mongoUri, { useUnifiedTopology: true, useNewUrlParser: true })
    .then(() => {
        console.log("DB Connection has been established successfully");
    })
    .catch((err) => {
        console.log(`Unable to connect DB: ${err}`);
    });


// Starting Server
app.listen(port, (err) => {
    console.log(`Server has started on ${port}`);
});
