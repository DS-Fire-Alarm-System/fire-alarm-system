const nodemailer = require('nodemailer');

const mailFn = async (to, from, subject, body) => {

    const transporter = await nodemailer.createTransport({
        host: "smtp.gmail.com",
        port: "587",
        secure: false, // true for 465, false for other ports
        auth: {
            user: "genrrefashionstore@gmail.com", // generated ethereal user
            pass: "genrre12345" // generated ethereal password
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
