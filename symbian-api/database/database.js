const Sequelize = require("sequelize");

const connection = new Sequelize("symbian_ds3m", "root", "", {
    host: "localhost",
    dialect: "mysql",
    timezone: "-03:00",
});

module.exports = connection;