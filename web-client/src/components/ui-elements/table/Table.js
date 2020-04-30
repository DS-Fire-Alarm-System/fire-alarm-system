import React, { Fragment } from "react";
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import CircularProgress from '@material-ui/core/CircularProgress';
import Switch from '@material-ui/core/Switch';

import { UICard } from "../card/UICard";
import "./table.css";


const DataTable = ({
    elementStyle = "",
    headers = [],
    body = []
}) => {
    return (
        <Fragment>
            <UICard elementStyle={"p-0"}>
                <Table className={elementStyle}>
                    <TableHead className={"tableHeader"}>
                        <TableRow>
                            {
                                headers.map((value, index) => {
                                    return (
                                        <TableCell key={index} className={"headerValue"}>{value}</TableCell>
                                    )
                                })
                            }
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {
                            (body.length > 0) ? (
                                body.map((value, index) => {
                                    return (
                                        <TableRow
                                            key={index}
                                            hover={true}
                                            className={
                                                (value.smoke_level >= 5 || value.co2_level >= 5) ? "alertClass" : "normalClass"
                                            }
                                        >
                                            <TableCell>{value._id}</TableCell>
                                            <TableCell align={"center"}>{value.floor_no}</TableCell>
                                            <TableCell align={"center"}>{value.room_no}</TableCell>
                                            <TableCell align={"center"}>{value.smoke_level}</TableCell>
                                            <TableCell align={"center"}>{value.co2_level}</TableCell>
                                            <TableCell>
                                                <Switch
                                                    checked={value.status}
                                                    color={
                                                        (value.smoke_level >= 5 || value.co2_level >= 5) ? "primary" : "secondary"
                                                    }
                                                />
                                            </TableCell>
                                        </TableRow>
                                    )
                                })
                            ) : (
                                (body === null) ? (
                                    <TableRow hover={true}>
                                        <TableCell>No records to show..</TableCell>
                                    </TableRow>
                                ) : (
                                    <TableRow>
                                        <TableCell colSpan={6} align={"center"}>
                                            <CircularProgress
                                                color={"primary"}
                                                size={90}
                                                thickness={3}
                                            />
                                        </TableCell>
                                    </TableRow>
                                )
                            )
                        }
                    </TableBody>
                </Table>
            </UICard>
        </Fragment>
    )
};

export default DataTable;
