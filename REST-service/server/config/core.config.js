const port = process.env.APP_PORT|| 4000;
const mongoUri = "mongodb+srv://testuser:testuser@firealarm-service-tjtd3.mongodb.net/test?retryWrites=true&w=majority";
const salt = "125r25dsrqcsywdt73fd6t5f78gft5bgyh9u79jh83uehrt538idhf5657";

export {
    port,
    mongoUri,
    salt
}
