import axios from 'axios';

// Send Email function
const sendEmail = (req, res) => {
    const body = {
        floor: req.body.floor,
        room: req.body.room
    };

    mailFn(body).then((result) => {
        return res.status(200).json({ status: "success", message: "Success" });
    }).catch((err) => {
        return res.status(400).json({ status: "error", message: err });
    })
};

// Sending Ajax request
const mailFn = (data) => {
    // Returning Promise
    return new Promise((resolve, reject) => {
        const axiosObject = {
            headers: {
                "Content-Type": "application/json"
            },
            method: 'post',
            url: "http://localhost:4005/api/emails",
            data: data
        };

        // Using axios
        axios(axiosObject)
            .then((result) => {
                resolve(true)
            })
            .catch((err) => {
                reject(err);
            })
    })
};

export default {
    sendEmail
}
