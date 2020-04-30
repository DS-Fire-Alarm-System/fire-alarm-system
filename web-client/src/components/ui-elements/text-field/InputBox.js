import React from "react";
import PropTypes from "prop-types";
import TextField from '@material-ui/core/TextField';

import './input-text.css';


const emptyFun = (...para) => undefined;

/**
 * --------------------------------------------
 * @Author: Chanaka Wickramasinghe
 * @Description: Material TextField Wrapper
 * --------------------------------------------
 */

const InputBox = ({
    elementStyle = "",
    isFullWidth = true,
    lableText = "",
    inputType = "text",
    inputValue = "",
    inputName = "",
    inputError = false,
    isMultiline = false,
    rows = 1,
    isAutoFocus = false,
    inputPlaceholder = "",
    isDisabled = false,
    isRequired = false,
    onChangeTxtFn = emptyFun
}) => {
    return (
        <TextField
            className={`defaultInputWrapper ${elementStyle}`}
            label={lableText}
            type={inputType}
            value={inputValue}
            required={isRequired}
            fullWidth={isFullWidth}
            name={inputName}
            autoFocus={isAutoFocus}
            placeholder={inputPlaceholder}
            disabled={isDisabled}
            error={inputError}
            multiline={isMultiline}
            rows={rows}
            onChange={event =>
                onChangeTxtFn({
                    name: inputName,
                    value: event.target.value,
                    eventInfo: event
                })
            }
        />
    );
};

/**
 * --------------------------------------------
 * @Author: Chanaka Wickramasinghe
 * @Description: Material TextField Wrapper
 * --------------------------------------------
 */

InputBox.propTypes = {
    /** Button element css class */
    elementStyle: PropTypes.string,
    /** is set full width or not */
    isFullWidth: PropTypes.bool,
    /** lable text */
    lableText: PropTypes.string,
    /**  input field type */
    inputType: PropTypes.oneOf(['text', 'password','number','email']),
    /**  input field type */
    inputValue: PropTypes.string,
    /**  input field name */
    inputName: PropTypes.string,
    /**  input field error message */
    inputError: PropTypes.bool,
    /** is text area or not */
    isMultiline: PropTypes.bool,
    /** is text area or not */
    rows: PropTypes.number,
    /** is auto Focus or not */
    isAutoFocus: PropTypes.bool,
    /** input field placeholder text */
    inputPlaceholder: PropTypes.string,
    /** enable/disabled field */
    isDisabled: PropTypes.bool,
    /** set required * mark */
    isRequired: PropTypes.bool,
    /** onchange text event Function */
    onChangeTxtFn: PropTypes.func,
};

//----------------InputBox---------------------

export default InputBox;