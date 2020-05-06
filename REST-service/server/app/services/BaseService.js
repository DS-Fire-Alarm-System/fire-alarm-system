// BaseService (Repository design pattern)
export class BaseService {
    constructor(model) {
        this.model = model;
    }

    // Creating a document
    create(userObject={}, cb) {
        this.model.create(userObject, cb);
    }

    // Finding a document
    findOne(filterOption={}, cb) {
        this.model.findOne(filterOption, cb);
    }

    // Finding multiple documents
    find(filterOption={}, cb) {
        this.model.find(filterOption, cb);
    }

    // Delete a document
    delete(filterOption={},cb) {
        this.model.deleteOne(filterOption, cb);
    }
}
