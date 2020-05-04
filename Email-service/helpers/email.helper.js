const nodemailer = require('nodemailer');

const mailFn = async (to, from, subject, body) => {

    const transporter = await nodemailer.createTransport({
        host: "smtp.gmail.com",
        port: "587",
        secure: false, // true for 465, false for other ports
        auth: {
            user: "ras@inovaitsys.com", // generated ethereal user
            pass: "inoras123" // generated ethereal password
        }
    });

    return await transporter.sendMail({
        from: from, // sender address
        to: to, // list of receivers
        subject: subject, // Subject line
        html: body // html body
    });
};

module.exports = {
    mailFn: mailFn
};
