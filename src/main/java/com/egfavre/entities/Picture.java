package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 6/24/16.
 */
@Entity
@Table(name = "pictures")
public class Picture {
    @GeneratedValue
    @Id
    int id;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String url;

    @Column(nullable = false)
    String artist;

    @Column(nullable = false)
    String description;

    public Picture() {
    }

    /*Picture 1:
    source:         http://islandsamerica.com/?p=225
    title:          Gullah Oysterna
    url:            http://islandsamerica.com/wp-content/uploads/2012/07/Gullah_Oysterna_VII-e1342138680238.jpg
    artist:         John W. Jones
    description:    One of America’s most profound artists finds his niche in depicting life in the Low Country islands of South Carolina and Georgia. Exploring the roots of African American history through the formerly enslaved inhabitants of these islands, John W. Jones brings to life the Gullah culture that still thrives today in the barrier islands along the Eastern seaboard.
                    This man happens to know a little bit about history firsthand. His great-great-grandmother, Carrie Viola Jones, was born a slave and still bore the scars of a brutal whipping when she died in 1963, at the age of 109. Jones witnessed the scars himself as a young child, and many years later re- connected with the reality of his ancestors after discovering depictions of slavery on old confederate currency. His resulting paintings evolved into a significant and acclaimed traveling exhibit and book titled “Confederate Currency: The Color of Money, Images of Slavery in Confederate and Southern States Currency.”
                    No longer is Jones removed by time from the struggles of those who came before him, choosing to embrace the stories that defined the nation in many ways, while also serving as a canvas for his own evolution as an artist. Yet his paintings choose to depict the strength as well as the tragedy of this part of America’s past. In his collection of art portraying the Gullah culture of the Low Country barrier islands, Jones does way more than give a history lesson – he introduces the world to the individuals and the customs that built these islands into the priceless chunk of heritage that they remain today.
     */


    /*Picture 2:
    source:         http://barbados.org/art/babb.htm
    title:          untitled
    url:            http://barbados.org/art/babmrkt.gif
    artist:         Fielding Babb
    description:    Fielding Babb has been around for many years. His work carries thirty years of maturity and he is now one of Barbados' most respected artists. In the 1960's Fielding found himself in a not so enviable position. As an artist it was hard to make ends meet. The Art movement at this time in Barbados had very little foundation and even less support. Fielding held on and has played an instrumental part in the growth of Fine Arts as we know it today (with art tours abroad, local support, growing respect for artist, more exposure and more art galleries).
                    In the early seventies Fielding worked mainly as a Water Colourist, but by the early eighties, had switched over to oils. His technique varies from palette knife to short diagonal strokes both of which he finds best for capturing the colours of his chosen scenes.
                    A typical Barbadian scene as captured by Fielding Babb
                    Fielding paints in true colour: brilliant skies form over traditional Bajan scenes like the local rum shop, the old chattel house or peaceful villages depicting Barbadian country life. What is important to Fielding is to create, through painting, a documentary of life at home in Barbados as he sees it.


     */

    /*Picture 3:
    source:         http://www.ba-bamail.com/content.aspx?emailid=16913
    title:          untitled
    url:            http://en.bcdn.biz/Images/2015/8/18/5832e4f5-a7d5-43a7-939b-bde7de010488.jpg
    artist:         Meadow Gist
    description:    Contemporary American artist Meadow Gist is fascinated with Colonial America. This California-based artist reimagines a bygone era in striking oil colors, and her love for the period shines through. To authentically paint Colonial America, Meadow spends a lot of time researching the period to make sure she portrays the details of the clothing, hair styles and home interiors of the era correctly.
     */

    /*Picture 4:
    source:         http://www.africanworldimports.com/thread_art.htm
    title:          Calabash Girls
    url:            http://www.africanworldimports.com/images/calabash_girls_2-big_crop_small.jpg
    artist:         unknown
    description:    Images of East African Women (Somalian) walking while carrying goods on their heads, wearing bright red and orange clothing, with beautiful blue skyline in the background.
     */

    /*Picture 5:
    source:         http://oilpaintingssuppliers.com/paintings/william-aiken-walker/charleston-vegetable-woman-25480.html
    title:          Vegetable Woman
    url:            http://oilpaintingssuppliers.com/images-oilpaintings/william-aiken-walker-charleston-vegetable-woman-oil-painting-25480.jpg
    artist:         William Aiken Walker
    description:   William Aiken Walker (March 11, 1839 – January 3, 1921) was an American artist best known for genre paintings of black sharecroppers.
                    Walker was born to an Irish Protestant father and a mother of South Carolina background in Charleston, South Carolina in 1839. In 1842, when his father died, Walker's mother moved the family to Baltimore, Maryland, where they remained until returning to Charleston in 1848.
                   In 1861, during the American Civil War, Walker enlisted in the Confederate army and served under General Wade Hampton in the Hampton's Legion. He was wounded at the Battle of Seven Pines (1862). After recuperating, he was transferred back to Charleston, where he was assigned picket duty, which gave him time to paint. For the next two years, he made maps and drawings of Charleston's defenses. He was separated from the military at the end of 1864. After the Civil War, Walker moved to Baltimore, where he produced small paintings of the “Old South” to sell as tourist souvenirs.
                    He is best known for his paintings depicting the lives of poor black emancipated slaves, especially sharecroppers in the post-Reconstruction American South. Two of his paintings were reproduced by Currier and Ives as chromolithographs. Walker continued painting until his death on January 3, 1921 in Charleston, where he is buried in the family plot at Magnolia Cemetery.
     */

}
