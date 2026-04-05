<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" indent="yes" encoding="UTF-8"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Recipe Information</title>
            </head>
            <body>
                <h1>Recipe Information</h1>

                <h2>
                    <xsl:value-of select="/recipe/name"/>
                </h2>

                <p>
                    Preparation time:
                    <xsl:value-of select="/recipe/prepTime"/>
                </p>

                <p>
                    Calories:
                    <xsl:value-of select="/recipe/calories"/>
                </p>

                <p>
                    Vegetarian:
                    <xsl:value-of select="/recipe/vegetarian"/>
                </p>

                <p>
                    Difficulty:
                    <xsl:value-of select="/recipe/difficulty"/>
                </p>

                <h3>Ingredients</h3>

                <table border="1">
                    <tr>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Available</th>
                        <th>Unit Code</th>
                    </tr>

                    <xsl:for-each select="/recipe/ingredients/ingredient">
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="quantity"/></td>
                            <td><xsl:value-of select="price"/></td>
                            <td><xsl:value-of select="available"/></td>
                            <td><xsl:value-of select="unitCode"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
