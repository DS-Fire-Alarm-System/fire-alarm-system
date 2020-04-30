import React, { Fragment } from "react";
import CircularProgress from '@material-ui/core/CircularProgress';

import "./circle-loader.css";


const CircleLoaderElement = ({
    isStatus=false,
    loaderSize=40,
    loaderThickness=2
}) => {
    return (
        <Fragment>
            {
                (isStatus) ? (
                    <div className={"pageLoader"}>
                        <CircularProgress
                            className={"loader"}
                            size={loaderSize}
                            thickness={loaderThickness}
                        />
                    </div>
                ) : null
            }
        </Fragment>
    );
};

export {
    CircleLoaderElement
}
