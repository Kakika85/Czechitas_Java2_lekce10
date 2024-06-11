# Lekce 10 – dokončení databází

1. Použij toto repository jako šablonu (Use this template), ze které si vytvoříš repository ve svém účtu na GitHubu.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Je nutné spustit alespoň jednou aplikaci, aby se vytvořila lokální databáze v adresáři `data`.
1. Postupně se vytvoří pro každý typ entity (třída, učitel, student, rodič) stránky se seznamem všech položek a stránky pro detail každé položky.
1. Vytvoř stránku pro přehled tříd, na které se bude vypisovat seznam tříd seřazený podle názvu třídy. V seznamu se bude zobrazovat název třídy, jméno třídního
   učitele (které bude odkazem na detailní stránku učitele) a odkaz na detail třídy.
1. Stránka s detailem třídy bude zobrazovat název třídy, jméno a příjmení třídního učitele (které bude zároveň odkazem na jeho detailní stránku) a seznam
   studentů ve třídě, seřazený abecedně podle příjmení a jména studenta. Jméno a příjmení studenta bude zároveň fungovat jako odkaz na stránku
   s detailními informacemi o studentovi.
1. Na stránku s detailem třídy přidej informaci o počtu studentů ve třídě. Tento počet načti přímo z databáze (konstrukce s použitím metody obsahující v názvu
   `countBy`). V našem jednoduchém příkladu by stačilo zjistit délku seznamu studentů ve třídě – ale představme si situaci, kdy by detailních záznamů byly třeba
   stovky tisíc, na stránce bychom je nechtěli vypisovat. V takovém případě je mnohem efektivnější načíst z databáze jen počet záznamů a nezískávat všechny
   záznamy. 
1. Doplň stránky se seznamem studentů, učitelů a rodičů. Všechny seznamy budou seřazené abecedně podle příjmení a jména, budou zobrazovat příjmení, jméno
   a odkaz na detail. V seznamu učitelů se navíc bude zobrazovat třída, které je daný učitel třídním učitelem (bude fungovat jako odkaz na detail učitele).
   Pozor na to, že ne každý učitel je třídním učitelem (pak se v seznamu u třídy nezobrazí nic).
1. Doplň stránky s detaily studenta, učitele a rodiče.
1. Na stránce s detailem studenta se bude zobrazovat, do které chodí třídy (s odkazem) a seznam rodičů (seřazený abecedně podle příjmení a jména), který bude
   zobrazovat příjmeí a jméno rodiče a odkaz na stránku s detailem.
1. Na stránce s detailem učitele se bude zobrazovat třída (s odkazem), které je daný učitel třídním učitelem. Případně tam nebude nic, pokud učitel není
   třídním učitelem.
1. Na stránce s detailem rodiče se bude zobrazovat e-mail a telefon rodiče. Dále se tam bude zobrazovat szenam jeho dětí – řazený abecedně dle příjmení a jména.
   Zobrazovat se bude příjmení a jméno dítěte a třída, do které chodí (bude fungovat zároveň jako odkaz na detail třídy). V seznamu dětí bude také odkaz
   na detail dítěte. Pro zobrazení ikon e-mailu a telefonu můžeš použít následující zápis ikon z ikonového fontu [Bootstrap Icons](https://icons.getbootstrap.com):
   ```
   <i class="bi bi-at"></i>
   <i class="bi bi-phone"></i>
   ```
1. Uprav stránku s detailem rodiče tak, aby e-mail a telefon mohly být nepovinné.

## Odkazy

* [Lekce 10](https://java.czechitas.cz/2024-jaro/java-2-online/lekce-10.html)
