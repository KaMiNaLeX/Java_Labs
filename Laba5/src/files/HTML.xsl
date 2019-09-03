<?xml version="1.0" encoding="UTF-8"?>
    <html>
        <body style="font-family: Arial; font-size: 12pt; background-color: green">
            <for-each select="Shturmovik">
                <div style="background-color: yellow; color: white; padding: 4px">
                    <span style="font-weight: bold">
                        <value-of select="Name"/>
                    </span>
                    <value-of select="salary"/>
                </div>
                <div style="margin-left: 20px; margin-bottom: 1em; font-size: 10pt">
                    <p>
                        <value-of select="level"/>
                        <span style="font-style: italic">
                            <value-of select="oil"/>
                        </span>
                    </p>
                    <table border="1">
                        <caption>Shturmovik</caption>
                        <tr>
                            <th>Name(Имя)</th>
                            <th>Salary(Зарплата)</th>
                            <th>level(уровень)</th>
                            <th>timenaliota(время налета)</th>
                            <th>oil(топливо)</th>

                        </tr>
                        <tr><td>PS-300</td><td>1400</td><td>Hard</td><td>500</td><td>disel</td></tr>


                    </table>
                </div>
            </for-each>
        </body>
    </html>
