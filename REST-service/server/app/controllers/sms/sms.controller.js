import axios from 'axios';

const sendSMS = (req, res) => {
    const body = {
        to: req.body.to,
        msj: req.body.msj
    };

    smsFn(body).then((result) => {
        return res.status(200).json({ status: "success", message: "Success" });
    }).catch((err) => {
        return res.status(400).json({ status: "error", message: err });
    })
};

const smsFn = (data) => {
    return new Promise((resolve, reject) => {
        const axiosObject = {
            headers: {
                "Content-Type": "application/json"
            },
            method: 'post',
            url: "http://localhost:4010/api/sms",
            data: data
        };

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
    sendSMS
}
