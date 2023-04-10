--Müşteri

create table tblmusteri(
	id bigserial primary key,
	ad varchar(100),
	soyad varchar(100),
	aciklama varchar(500)
)
--İletişim

create table tbliletisim(
	id bigserial primary key,
	musteriid bigint references tblmusteri(id) not null , --foreign key
	ad varchar(100),
	il varchar(100),
	ilce varchar(100),
	mahalle varchar(100),
	telefon varchar(20),
	acikadres varchar(200)
)
--Satış

create table tblsatis(
	id bigserial primary key,
	musteriid bigint references tblmusteri(id) not null,
	satistarihi bigint, --long date
	toplamfiyat double precision,
	odenen double precision,
	odemesekli varchar(50)
)
--Ürün

create table tblurun(
	id bigserial primary key,
	ad varchar(250),
	marka varchar(200),
	model varchar(200),
	barkod int,
	stok int,
	fiyat double precision,
	kdv int
)
--Sepet

create table tblsepet(
	id bigserial primary key,
	satisid bigint references tblsatis(id),
	urunid bigint references tblurun(id),
	birimfiyat double precision,
	adet int,
	toplamfiyat double precision
)

-----------------------------
-----------------------------
-- Sorular 
-- A Kişisin hangi ürünleri satın almıştır ?

select * from tblmusteri where ad = 'Doria'  -- id = 9

select * from tblsatis where musteriid = 9

select * from tblsepet where satisid in(953,994)

select * from tblurun where id in(52)


-- A kişisi düşünüldüğünde hangi üründen kaç adet satın alınmış ? 
-- Ve A kişinin en çok satın aldığı ilk 3 ürün hangisi

select urn.ad,count(urn.ad) from tblmusteri as mst
left join tblsatis as sts on sts.musteriid = mst.id
right join tblsepet as spt on spt.satisid = sts.id 
left join tblurun as urn on urn.id = spt.urunid
group by urn.ad order by (urn.ad) desc limit 3

----------------------------

create view vwmusteriurunsatis 
as 
select mst.id,mst.ad as mstad ,urn.id as urnid ,urn.ad as urnad from tblmusteri as mst
left join tblsatis as sts on sts.musteriid = mst.id
right join tblsepet as spt on spt.satisid = sts.id 
left join tblurun as urn on urn.id = spt.urunid

select urnad,count(urnad) as adet from vwmusteriurunsatis
group by urnad order by adet desc limit 3

select 5+6 as toplam 

select now()



------------------------------

do $$
begin 

	for counter in 1..30 loop
	raise notice 'döngü......:%' , counter;
	insert into tblurun(ad,fiyat) values (concat('seker',counter),544);
	end loop;
	
end; $$





