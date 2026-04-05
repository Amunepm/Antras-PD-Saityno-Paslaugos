<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format">

    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4"
                                       page-height="29.7cm"
                                       page-width="21cm"
                                       margin-top="2cm"
                                       margin-bottom="2cm"
                                       margin-left="2cm"
                                       margin-right="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="A4">
                <fo:flow flow-name="xsl-region-body">

                    <fo:block font-size="18pt" font-weight="bold" space-after="10pt">
                        Recipe Information
                    </fo:block>

                    <fo:block space-after="6pt">
                        Name: <xsl:value-of select="/recipe/name"/>
                    </fo:block>

                    <fo:block space-after="6pt">
                        Preparation time: <xsl:value-of select="/recipe/prepTime"/>
                    </fo:block>

                    <fo:block space-after="6pt">
                        Calories: <xsl:value-of select="/recipe/calories"/>
                    </fo:block>

                    <fo:block space-after="6pt">
                        Vegetarian: <xsl:value-of select="/recipe/vegetarian"/>
                    </fo:block>

                    <fo:block space-after="10pt">
                        Difficulty: <xsl:value-of select="/recipe/difficulty"/>
                    </fo:block>

                    <fo:block font-size="14pt" font-weight="bold" space-after="8pt">
                        Ingredients
                    </fo:block>

                    <fo:table table-layout="fixed" width="100%" border="1pt solid black">
                        <fo:table-body>
                            <fo:table-row font-weight="bold">
                                <fo:table-cell><fo:block>Name</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block>Quantity</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block>Price</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block>Available</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block>Unit Code</fo:block></fo:table-cell>
                            </fo:table-row>

                            <xsl:for-each select="/recipe/ingredients/ingredient">
                                <fo:table-row>
                                    <fo:table-cell><fo:block><xsl:value-of select="name"/></fo:block></fo:table-cell>
                                    <fo:table-cell><fo:block><xsl:value-of select="quantity"/></fo:block></fo:table-cell>
                                    <fo:table-cell><fo:block><xsl:value-of select="price"/></fo:block></fo:table-cell>
                                    <fo:table-cell><fo:block><xsl:value-of select="available"/></fo:block></fo:table-cell>
                                    <fo:table-cell><fo:block><xsl:value-of select="unitCode"/></fo:block></fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                        </fo:table-body>
                    </fo:table>

                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

</xsl:stylesheet>
