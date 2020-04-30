import React, { Fragment } from "react";
import PropTypes from "prop-types";
import Card from '@material-ui/core/Card';

import "./ui-card.css";


/**
 * --------------------------------------------
 * @Author: Chanaka Wickramasinghe
 * @Description: card Wrapper
 * --------------------------------------------
 */

const UICard = ({
    elementStyle = "",
    children = null
}) => {
    return (
        <Card className={`defaultCardWrapper ${elementStyle}`}>
            <Fragment>
                {children}
            </Fragment>
        </Card>
    );
};

/**
 * --------------------------------------------
 * @Author: Chanaka Wickramasinghe
 * @Description: card Wrapper
 * --------------------------------------------
 */

UICard.propTypes = {
    /** card element css class */
    elementStyle: PropTypes.string,
    /** card children */
    children: PropTypes.node
};

//----------------UICard---------------------

export { UICard };