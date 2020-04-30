import React from "react";
import Snackbar from '@material-ui/core/Snackbar';

import "./flash-message.css";



const emptyFun = (...para) => undefined;

const FlashMessageBox = ({
     status = true,
     handleClose = emptyFun,
     content = {},
}) => {
    const defaultClass = "defaultFlashMessageBox ";
    const defaultContentClass = "defaultFlashContent ";

    return (
        <div>
            <Snackbar
                anchorOrigin={{
                    vertical: 'top',
                    horizontal: 'right',
                }}
                open={status}
                autoHideDuration={2500}
                transitionDuration={1000}
                onClose={handleClose}
                className={defaultClass + content.cssClass}
                ContentProps={{
                    'aria-describedby': 'message-id',
                }}
                message={
                    <span id="message-id" className={defaultContentClass}>
                        <i className={content.icon}></i>
                        <span className="messageBoxTxt">{content.message}</span>
                    </span>
                }
            />
        </div>
    );
};

export default FlashMessageBox;