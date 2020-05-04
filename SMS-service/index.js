const express = require('express');

const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));


app.post('/api/sms', (req, res) => {
    sendMsj({});
    res.send("Success");
});


const sendMsj = (data) => {
  console.log("SMS has sent successfully");
};


app.listen(4010, (err) => {
    console.log("Server has started");
});
