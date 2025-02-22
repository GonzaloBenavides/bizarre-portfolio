import { User } from "./user";


export class Suggest {
    id:number;
    user:User = new User();
    suggestionText:string;
    createAt:string;
}
