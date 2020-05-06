import express from 'express';
import compress from 'compression';
import cors from 'cors';
import helmet from 'helmet';

const app = express();

// Configure express middlewares
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(compress());
app.use(cors());
app.use(helmet());


export default app;
