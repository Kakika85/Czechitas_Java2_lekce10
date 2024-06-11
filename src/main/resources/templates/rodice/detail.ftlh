[#ftl]

[@c.page title="Rodic ${rodic.celeJmeno}"]
    <h1>Rodic: <strong>${rodic.celeJmeno}</strong></h1>
    <p>email: ${rodic.email}</p>
    <p>telefon: ${rodic.telefon}</p>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Příjmení</th>
            <th scope="col">Jméno</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list rodic.deti as dite]
            <tr>
                <td>${dite.prijmeni}</td>
                <td>${dite.jmeno}</td>
                <td><a href="/studenti/${dite.id}"><i class="bi bi-arrow-right-square-fill"></i></a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
