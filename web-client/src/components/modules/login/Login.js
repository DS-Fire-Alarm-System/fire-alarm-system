import React, { useState } from "react";
import axios from "axios";

import { UICard } from "../../ui-elements/card/UICard";
import InputBox from "../../ui-elements/text-field/InputBox";
import InputButton from "../../ui-elements/button/InputButton";
import { CircleLoaderElement } from "../../ui-elements/circle-loader/CircleLoader";
import FlashMessageBox from "../../ui-elements/flash-message/FlashMessageBox";
import "./login.css";


const Login = (props) => {

    const [form, setForm] = useState({});
    const [loader, setLoader] = useState(false);
    const [flash, setFlash] = useState(false);

    const onChangeFn = (event) => {
        setForm({
            ...form,
            [event.name]: event.value
        })
    };

    const onSubmit = () => {
        setLoader(true);
        const axiosObject = {
            headers: {
                "Content-Type": "application/json"
            },
            method: 'post',
            url: 'http://localhost:4000/api/auth',
            data: {
                username: form.username,
                password: form.password
            }
        };

        axios(axiosObject)
            .then((result) => {
                setLoader(false);
                if (result.data.message === "Authorized") {
                    props.history.push('/fire-alarm-list');
                }
            })
            .catch((err) => {
                setLoader(false);
                setFlash(true);
            })
    };

    return (
        <div className={"container"}>
            <div className={"row justify-content-center"}>
                <div className={"col-md-6"}>
                    <div className={"loginWrapper text-center"}>
                        <UICard>
                            <h4>LOGIN</h4>
                            <p>Enter your Username and Password</p>

                            <InputBox
                                lableText={"Username"}
                                isRequired={true}
                                inputName={"username"}
                                inputValue={form.username}
                                inputPlaceholder={'test@gmail.com'}
                                onChangeTxtFn={onChangeFn}
                            />

                            <InputBox
                                elementStyle={"mt-2"}
                                lableText={"Password"}
                                isRequired={true}
                                inputName={"password"}
                                inputType={"password"}
                                inputValue={form.password}
                                inputPlaceholder={'******************'}
                                onChangeTxtFn={onChangeFn}
                            />

                            <InputButton
                                elementStyle={"mt-4 mb-2"}
                                btnText={"Login"}
                                isFullWidth={true}
                                btnSize={"medium"}
                                onClickBtnFn={onSubmit}
                            />
                        </UICard>
                    </div>
                </div>
            </div>

            <CircleLoaderElement
                isStatus={loader}
                loaderSize={50}
                loaderThickness={3}
            />

            <FlashMessageBox
                status={flash}
                content={{
                    icon: "fas fa-times-circle",
                    cssClass: "errorFlashMessage",
                    message: "Invalid Username or Password!!"
                }}
                handleClose={() => setFlash(false)}
            />
        </div>
    )
};

export default Login;
