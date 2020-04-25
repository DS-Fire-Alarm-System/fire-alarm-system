import mongoose from 'mongoose';
import app from './bootstrap/routes-config';
import { port, mongoUri } from "./config/core.config";


mongoose.connect(mongoUri, { useUnifiedTopology: true, useNewUrlParser: true })
    .then(() => {
        console.log("DB Connection has been established successfully");
    })
    .catch((err) => {
        console.log(`Unable to connect DB: ${err}`);
    });


app.listen(port, (err) => {
    console.log(`Server has started on ${port}`);
});
