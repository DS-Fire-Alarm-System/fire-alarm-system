import React from "react";
import PropTypes from "prop-types";
import Button from '@material-ui/core/Button';


const emptyFun = (...para) => undefined;

/**
 * --------------------------------------------
 * @Author: Chanaka Wickramasinghe
 * @Description: Input button Wrapper
 * --------------------------------------------
 */

// InputButton color options
const inputBtnColors = {
    default: "default",
    inherit: "inherit",
    primary: "primary",
    secondary: "secondary"
};

// InputButton size options
const inputBtnSizes = {
    small: "small",
    medium: "medium",
    large: "large"
};

// InputButton variant options
const inputBtnVariants = {
    text: "text",
    outlined: "outlined",
    contained: "contained"
};

const InputButton = ({
     elementWrapperStyle = "",
     elementStyle = "",
     btnText = "",
     btnName = "",
     btnSize = inputBtnSizes.small,
     btnColor = inputBtnColors.primary,
     isFullWidth = false,
     isBtnDisabled = false,
     startIcon = null,
     endIcon = null,
     variant = inputBtnVariants.contained,
     onClickBtnFn = emptyFun
}) => {
    return (
        <span className={`${elementWrapperStyle}`}>
            <Button
                variant={variant}
                color={btnColor}
                size={btnSize}
                className={`${elementStyle}`}
                name={btnName}
                fullWidth={isFullWidth}
                disabled={isBtnDisabled}
                onClick={(event) => onClickBtnFn({ name: btnName, eventInfo: event })}
                startIcon={(startIcon != null) ? (<i className={startIcon}/>) : null}
                endIcon={(endIcon != null) ? (<i className={endIcon}/>) : null}
            >

                    <span style={{ textTransform: "none"}}>{btnText}</span>

                </Button>
        </span>
    );
};

/**
 * --------------------------------------------
 * @Author: Chanaka Wickramasinghe
 * @Description: Input button Wrapper
 * --------------------------------------------
 */

InputButton.propTypes = {
    /** element Wrapper css class */
    elementWrapperStyle: PropTypes.string,
    /** button element css class */
    elementStyle: PropTypes.string,
    /** button text */
    btnText: PropTypes.string,
    /** button name */
    btnName: PropTypes.string,
    /** button size */
    btnSize: PropTypes.oneOf(['small', 'medium', 'large']),
    /** button color */
    btnColor: PropTypes.oneOf(['default', 'inherit', 'primary', 'secondary']),
    /** Is full width set or not */
    isFullWidth: PropTypes.bool,
    /** Is button disable or not */
    isBtnDisabled: PropTypes.bool,
    /** button left icon */
    startIcon: PropTypes.string,
    /** button right icon */
    endIcon: PropTypes.string,
    /** button variant */
    variant: PropTypes.oneOf(['text', 'outlined', 'contained']),
    /** Onclick button function */
    onClickBtnFn: PropTypes.func
};

export default InputButton;