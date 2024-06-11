[#ftl]

[@c.page title="Seznam tříd"]
    <h1>Seznam tříd</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Název</th>
            <th scope="col">Třídní učitel</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list tridy as trida]
            <tr>
                <td>${trida.nazev}</td>
                <td><a href="/ucitele/${trida.tridniUcitel.id}">${trida.tridniUcitel.celeJmeno}</a></td>
                <td><a href="/tridy/${trida.id}"><i class="bi bi-arrow-right-square-fill"></i></a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
