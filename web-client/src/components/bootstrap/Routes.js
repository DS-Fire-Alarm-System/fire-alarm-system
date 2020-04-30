import React, { Fragment } from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";

import Login from "../modules/login/Login";
import FireAlarmList from "../modules/fire-alarm-list/FireAlarmList";

const Routes = () => {
    return (
        <Fragment>
            <BrowserRouter>
                <Switch>
                    <Route path={"/"} exact={true} component={Login} />
                    <Route path={"/fire-alarm-list"} exact={true} component={FireAlarmList} />
                </Switch>
            </BrowserRouter>
        </Fragment>
    )
};

export default Routes;
