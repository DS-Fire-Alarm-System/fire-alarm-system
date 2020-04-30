const axios = require('axios');

const getSensorData = () => {
    return new Promise((resolve, reject) => {
        const data = [];

        const axiosObject = {
            headers: {
                "Content-Type": "application/json"
            },
            method: 'get',
            url: 'http://localhost:4000/api/fire-alarms'
        };

        axios(axiosObject)
            .then((result) => {
                result.data.data.forEach((value) => {
                    data.push(value._id);
                });

                resolve(data);
            })
            .catch((err) => {
                reject(err);
            })
    })
};

const getRandomInt = (min, max) => {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min)) + min; //The maximum is exclusive and the minimum is inclusive
};

const updateSensorData = (id) => {
    const fields = ["smoke_level", "co2_level"];
    let selectedField = fields[Math.floor(Math.random() * fields.length)];

    const randomValue = getRandomInt(1, 10);

    const axiosObject = {
        headers: {
            "Content-Type": "application/json"
        },
        method: 'put',
        url: `http://localhost:4000/api/fire-alarms/${id}`,
        data: {
            [selectedField]: randomValue
        }
    };

    axios(axiosObject)
        .then((result) => {
            if (result.data.status === "success") {
                return result.data.status;
            }
        })
};

const mainMethod = async () => {
    let sensorsToBeSimulated = Number(process.argv[2]) || 1;
    getSensorData()
        .then((result) => {
            if (result.length < sensorsToBeSimulated) {
                sensorsToBeSimulated = result.length;
            }

            for (let i = 0; i < sensorsToBeSimulated; i++) {
                setInterval(() => {
                    updateSensorData(result[i]);
                }, 10000)
            }
        });
};

mainMethod();
