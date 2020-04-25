export class BaseService {
    constructor(model) {
        this.model = model;
    }

    create(userObject={}, cb) {
        this.model.create(userObject, cb);
    }

    findOne(filterOption={}, cb) {
        this.model.findOne(filterOption, cb);
    }

    find(filterOption={}, cb) {
        this.model.find(filterOption, cb);
    }

    delete(filterOption={},cb) {
        this.model.deleteOne(filterOption, cb);
    }
}
