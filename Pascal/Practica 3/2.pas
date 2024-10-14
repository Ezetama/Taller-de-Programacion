Program ej2p3;

type
  r1= 1..31;
  r2= 1..12;
  fech= record
    dia: r1;
    mes: r2;
    ano: integer;
  end;
  venta = record
    codigo: integer;
    fecha: fech;
    cant: integer;
   end;
   producto= record
     codigo: integer;
     cant: integer;
  end;
  arbol = ^nodo;
  nodo = record
    dato: venta;
    hi:arbol;
    hd: arbol;
  end;
  arbol2 = ^nodo2;
  nodo2 = record
    dato: producto;
    hi: arbol2;
    hd: arbol2;
  end;
  
  datolist = record
    fecha:fech;
    cant:integer;
  end;
  
  lista= ^nodolista;
  
  nodolista=record
    datolista: datolist;
    sig:lista;
  end;
    
  vrea = record
    codigo:integer;
    L: lista;
  end;
    
  arbol3 = ^nodo3;
  nodo3 = record
    dato: vrea;
    hi: arbol3;
    hd: arbol3;
  end;

procedure cargarventa (var v:venta);

begin
  v.codigo:= random (11);
  if v.codigo<>0 then begin
    v.fecha.dia:=1+ random (31);
    v.fecha.mes:= 1+random (12);
    v.fecha.ano:= 2000+ random (25);
    v.cant:= random (41);
  end;
end;

procedure cargararbol1 (var a: arbol; v:venta);
begin
  if a=nil then begin
    new (a);
    a^.dato:= v;
    a^.hi:= nil;
    a^.hd:= nil;
  end
  else begin
  if v.codigo<a^.dato.codigo then
    cargararbol1 (a^.hi,v)
  else
    cargararbol1 (a^.hd,v);
  end
end;

procedure cargararbol2 (var a2:arbol2; codigo,cantidad: integer);
begin
  if a2=nil then begin
    new (a2);
    a2^.dato.codigo:=codigo;
    a2^.dato.cant:=0;
    a2^.hi:= nil;
    a2^.hd:= nil;
  end;
  if codigo=a2^.dato.codigo then begin
    a2^.dato.cant:=a2^.dato.cant+cantidad;
  end
  else
  if codigo<a2^.dato.codigo then
    cargararbol2 (a2^.hi,codigo,cantidad)
  else
    cargararbol2 (a2^.hd,codigo,cantidad)
end;

procedure agregarlista (var l:lista; fecha: fech; cant: integer);
var
  aux: lista;
begin
  new (aux);
  aux^.datolista.fecha:=fecha;
  aux^.datolista.cant:=cant;
  aux^.sig:=l;
  l:=aux;
end;
procedure cargararbol3 (var a3: arbol3; v:venta);

begin
  if a3=nil then begin
    new (a3);
    a3^.dato.codigo:=v.codigo;
    a3^.dato.l:=nil;
    a3^.hi:=nil;
    a3^.hd:=nil;
  end;
  if a3^.dato.codigo=v.codigo then
    agregarlista (a3^.dato.l,v.fecha,v.cant)
  else
    if a3^.dato.codigo>v.codigo then
      cargararbol3 (a3^.hi,v)
    else
      cargararbol3 (a3^.hd,v)   
end;

procedure cargar1 (var a: arbol; var a2: arbol2; var a3: arbol3);
var
  v:venta;
begin
  cargarventa (v);
  writeln ('Venta cargada');
  while v.codigo<>0 do begin
    cargararbol1 (a,v);
    cargararbol2 (a2, v.codigo,v.cant);
    cargararbol3 (a3,v);
    writeln ('venta agregada al arbol');
    cargarventa (v);
    writeln ('venta leida nuevamente');
  end;
end;

procedure imprimirventa (v: venta);

begin
  writeln ('El codigo de producto vendido es: ',v.codigo);
  writeln ('La fecha de venta del producto fue el dia ',v.fecha.dia, ' del mes ',v.fecha.mes, ' del ano ',v.fecha.ano);
  writeln ('La cantidad de unidades vendidas en la venta fue de: ',v.cant);
  writeln ('-------------------------------------------------');
end;

procedure imprimir (a: arbol);

begin
  if a<>nil then begin
    imprimir (a^.hi);
    imprimirventa(a^.dato);
    imprimir (a^.hd);
  end;
end;

procedure imprimir2 (a2:arbol2);

begin
  if a2<>nil then begin
    imprimir2 (a2^.hi);
    writeln ('El producto con codigo ',a2^.dato.codigo, ' vendio ',a2^.dato.cant, ' unidades');
    imprimir2 (a2^.hd);
  end;
end;

procedure imprimirlista (l:lista);
begin
  while l<>nil do begin
    writeln ('venta realizada el ',l^.datolista.fecha.dia, '/',l^.datolista.fecha.mes,'/',l^.datolista.fecha.ano,' por ',l^.datolista.cant,' unidades');
    l:=l^.sig;
  end;
end;

procedure imprimir3 (a3: arbol3);
begin
  if a3<>nil then begin
    imprimir3 (a3^.hi);
    writeln ('El producto con el codigo ',a3^.dato.codigo, ' concreto las siguientes ventas');
    imprimirlista (a3^.dato.l);
    imprimir3 (a3^.hd);
  end;
end;

procedure leerfechaamano (var f:fech);

begin
  writeln ('Ingrese el DIA de la fecha del que quiere chequear cantidad total de productos vendidos');
  readln (f.dia);
  writeln ('Ingrese el mes de la fecha del que quiere chequear cantidad total de productos vendidos');
  readln (f.mes);
  writeln ('Ingrese el DIA de la fecha del que quiere chequear cantidad total de productos vendidos');  
  readln (f.ano);
end;

procedure puntob2 (a:arbol; f:fech; var cant:integer);
begin
  if a<>nil then begin
    if (a^.dato.fecha.dia = f.dia) and (a^.dato.fecha.mes = f.mes) and (a^.dato.fecha.ano = f.ano) then
      cant:=cant+ a^.dato.cant;
    puntob2 (a^.hi,f,cant);
    puntob2 (a^.hd,f,cant);
  end;
end;

procedure puntob (a:arbol; fecha: fech);
var
  cant: integer;
begin
  cant:=0;
  puntob2 (a,fecha,cant);
  writeln ('La cantidad de productos vendidos que hubo en la fecha ingresada es de: ',cant);
end;

procedure puntoc2 (a2:arbol2; var codmax,maxven:integer);
begin
  if a2<>nil then begin
    puntoc2 (a2^.hi,codmax,maxven);
    if a2^.dato.cant>maxven then begin
      maxven:= a2^.dato.cant;
      codmax:=a2^.dato.codigo;
    end;
    puntoc2 (a2^.hd,codmax,maxven);
  end;
end;

procedure puntoc (a2:arbol2);
var
  codigomax,maxventas:integer;
begin
  maxventas:=0;
  puntoc2 (a2,codigomax,maxventas);
  writeln ('El codigo del producto con mas ventas es el ',codigomax, ' que tiene ',maxventas, ' unidades vendidas');
end;

procedure recorrerlista (l: lista; codigo:integer; var codmin,minven: integer);
var
  suma:integer;
begin
  suma:=0;
  while l<>nil do begin
    suma:=suma+l^.datolista.cant;
    l:=l^.sig;
  end;
  if suma<minven then begin
    minven:=suma;
    codmin:=codigo;
  end;
end;

procedure puntod2 (a3: arbol3; var codmin,minven: integer);

begin
  if a3<>nil then begin
    puntod2 (a3^.hi,codmin,minven);
    recorrerlista (a3^.dato.L,a3^.dato.codigo,codmin,minven);
    puntod2 (a3^.hd,codmin,minven);
  end;
end;


procedure puntod (a3:arbol3);
var
  codmin,minven: integer;
begin
  minven:=9999;
  puntod2 (a3,codmin,minven);
  writeln ('El codigo del producto con menos ventas es el ',codmin, ' que tiene ',minven, ' unidades vendidas');
end;

var
  a: arbol;
  a2: arbol2;
  a3:arbol3;
  fecha:fech;
begin
  randomize;
  a:=nil;
  cargar1 (a,a2,a3);
  imprimiR (a);
  imprimir2 (a2);
  imprimir3 (a3);
  leerfechaamano (fecha);
  puntob (a,fecha);
  puntoc (a2);
  puntod (a3);
end.
   