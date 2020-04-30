import React, { Fragment, useState, useEffect } from "react";
import axios from "axios";

import DataTable from "../../ui-elements/table/Table";
import "./fire-alarm-list.css";


const FireAlarmList = () => {
    const headers = ["Id", "Floor No", "Room No", "Smoke Level", "CO2 Level", "Status"];
    const [data, setData] = useState([]);

    useEffect(() => {
        getSensorData();
        setTimerFn();
    }, []);

    const setTimerFn = () => {
        setInterval(() => {
            getSensorData();
        }, 5000)
    };

    const getSensorData = () => {
        const axiosObject = {
            headers: {
                "Content-Type": "application/json"
            },
            method: 'get',
            url: 'http://localhost:4000/api/fire-alarms'
        };

        axios(axiosObject)
            .then((result) => {
                if (result.data.data.length === 0) {
                    setData(null);
                } else {
                    setData(result.data.data);
                }
            })
            .catch((err) => {
                setData(null);
            })
    };

    return (
        <Fragment>
            <header className="header">
                <h1>Fire Alarm Service</h1>
            </header>
            
            <div className={"container"}>
                <div className={"row"}>
                    <div className={"col-md-12"}>
                        <div className={"tableWrapper mt-4"}>
                            <DataTable
                                headers={headers}
                                body={data}
                            />
                        </div>
                    </div>
                </div>
            </div>
        </Fragment>
    )
};

export default FireAlarmList;
