const express = require('express');
const compress = require('compression');
const cors = require('cors');
const helmet = require('helmet');
const { mailFn } = require('./helpers/email.helper');

const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(compress());
app.use(cors());
app.use(helmet());


app.post('/api/emails', (req, res) => {

    const html = `<h4>Dear Sir/Madam</h4><br><h4>There is an alert from sensor (Floor: ${req.body.floor}, Room: ${req.body.room})</h4><br><h4>Thanks & Regards,<br>Fire Alarm Service</h4>`;

    mailFn("blcchanaka@gmail.com", "firalarmservice@gmail.com", "Sensor Alert", html);
    res.send("Email Send");
});


app.listen(4005, (err) => {
    console.log("Server has started");
});
