export class Cliente{
    constructor(){}
    cli_id:number | undefined    
    cli_nombres: string | undefined
    cli_apellidos: string | undefined
    cli_telefono: string | undefined
    direccionList: Direccion[]
}

export class Direccion{
    dir_codigo: string;
    dir_descripcion: string;
    dir_id?: string;
}

