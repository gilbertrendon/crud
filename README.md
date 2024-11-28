# crud

//Para la inserción en bd(del backend): insert into car(id, aumento, finsercion, habilitado, img, valor, modelo)values (444, 0.05 , '28/10/2020', true, 'https://hips.hearstapps.com
/hmg-prod.s3.amazonaws.com/images/ford-gt-subasta-1590059807.jpg?crop=0.985xw:0.911xh;0,0.0541xh&resize=480:*' ,200000, "1980" )


{
	"id": 1,
	"aumento": 0.5,
	"finsercion": "29/10/2020",
	"habilitado": true,
	"img": "https://imganuncios.mitula.net/renault_9_1993_gasolina_renault_9_brio_1993_al_dia_recibo_moto_3740129565186886781.jpg",
	"valor": 20000

}

'{ "id": "4", "aumento": 0.5, "finsercion": "29/10/2020", "habilitado": "true",
"img": "https://imganuncios.mitula.net/renault_9_1993_gasolina_renault_9_brio_1993_al_dia_recibo_moto_3740129565186886781.jpg",
"valor": "20000" }';



--Para insertar desde postman
{
    "id": 44,
    "img": "https://hips.hearstapps.com\r\n/hmg-prod.s3.amazonaws.com/images/ford-gt-subasta-1590059807.jpg?crop=0.985xw",
    "valor": 200000.0,
    "aumento": 0.05,
    "finsercion": "28/10/2020",
    "habilitado": true
}





--Para acceder a la base de datos
--http://localhost:8085/h2-console/login.jsp?jsessionid=353cab2a54c7e4ee3f4cd704b7388d53

--para las inserciones desde la base de datos
insert into car(id, aumento, finsercion, habilitado, img, valor)values (444, 0.05 , '28/10/2020', true, 'https://hips.hearstapps.com
/hmg-prod.s3.amazonaws.com/images/ford-gt-subasta-1590059807.jpg?crop=0.985xw:0.911xh;0,0.0541xh&resize=480:*' ,200000 )

--Rutas:
--Obtener lista de carros: http://localhost:3000/api/cars
--Obtener carro por id: http://localhost:3000/api/carbyid/2
--Donde 2 es el id del carro(que puede variar)
--Borrar carro por id: http://localhost:3000/api/delcarbyid/222
--Donde 222 es el id del carro a eliminar

CARPETA DONDE ESTÁ INSTALADO EL JDK Y EL JRE:
C:\Program Files\Java


