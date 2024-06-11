[#ftl]

[@c.page title="Třída ${trida.nazev}"]
    <h1>Třída: <strong>${trida.nazev}</strong></h1>
    <p>Třídní učitel: <a href="/ucitele/${trida.tridniUcitel.id}">${trida.tridniUcitel.celeJmeno}</a></p>
    <p>Počet studentů: ${pocetStudentu}</p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Příjmení</th>
            <th scope="col">Jméno</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list trida.studenti as student]
            <tr>
                <td>${student.prijmeni}</td>
                <td>${student.jmeno}</td>
                <td><a href="/studenti/${student.id}"><i class="bi bi-arrow-right-square-fill"></i></a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
