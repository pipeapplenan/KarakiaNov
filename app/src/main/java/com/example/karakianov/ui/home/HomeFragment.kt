package com.example.karakianov.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.karakianov.MainActivity
import com.example.karakianov.R
import com.example.karakianov.adapter.KarakiaAdapter
import com.example.karakianov.data.FragmentLifeViewModel
import com.example.karakianov.data.KarakiaData
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(){
    private val karakiaList = generateList()
    private val viewModel: FragmentLifeViewModel = FragmentLifeViewModel() // initialize it

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        home_initial.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = KarakiaAdapter(karakiaList)
        }
        if(viewModel != null) {
            viewModel.activity = activity as MainActivity
            lifecycle.addObserver(viewModel)
        }
    }

    private fun generateList(): ArrayList<KarakiaData>{
        val karakiaStringList = ArrayList<KarakiaData>()
        karakiaStringList.add(
            KarakiaData(
                1,
                "Toia mai",
                "Karakia Timatanga or opening prayer/incantation.\n\n" +
                        "Karakia are Māori incantations and prayers that are used to invoke spiritual guidance and protection pay honor to those who came before us, and to bless the space.\n\n" +
                        "This karakia helps guide us towards the aims and objectives of Te Pūkenga, delivering equitable outcomes for all learners.\n\n" +
                        "Background are retrieved from https://www.britannica.com/topic/Maori/Maori-culture-in-the-21st-century\n\n" +
                        "Descriptions are retrieved https://spinpoi.com/karakia",
                R.drawable.openingone,
                "\nDraw forward our learners\n" +
                        "Draw forward our staff\n" +
                        "Draw forward the many\n " +
                        "people from the\n" +
                        "four corners of the world\n" +
                        "Draw them forward under the mantle of\n" +
                        "love and peace\n" +
                        "\nLet us remain steadfast to these words!",
                "\nTōia mai ngā tauira\n" +
                        "Tōia mai ngā kaimahi\n" +
                        "Tōia mai ngā tāngata\n" +
                        " nō ngā hau e whā\n" +
                        "Tōia mai i runga i te aroha me te\n" +
                        "rangimārie\n" +
                        "\nKia mau, kia ita\n" +
                        "Haumi e, hui e\n" +
                        "Taiki e!\n",
                R.raw.opening1
            )
        )
        karakiaStringList.add(
            KarakiaData(
                2,
                "Whakataka te hau\n",
                "  Karakia Timatanga or opening prayer.\n\n" +
                        "Whakataka' is a modification of the final stanza of 'Tua, Tua,' a longer karakia telling how the waka Takitimu survived a storm when exploring the coast of South Westland because it was well-built and well-managed.\n\n" +
                        "It reminds us that the great natural forces can harm us, but if we work hard preparing for them, and then respond in harmony with them and in harmony with our ancestors' response. \n\n" +
                        "We are rewarded with warmth and calm, both literally and spiritually.\n\n" +
                        "Picture retrieved from https://www.youtube.com/watch?v=yDDq5tcnOi8\n\n" +
                        "Descriptions are retrieved from https://folksong.org.nz/whakataka_te_hau/",
                R.drawable.openingtwo,
                "\nThe wind swings to the west\n" +
                        "then turns into a southerly.\n" +
                        "\nmaking it prickly cold inland,\n" +
                        "and piercingly cold on the coast.\n" +
                        "\nMay the dawn rise red-tipped\n" +
                        "on ice, on snow, on frost.\n" +
                        "\nJoin! Gather! Intertwine!",
                "\nWhakataka te hau ki te uru,\n" +
                        "Whakataka te hau ki te tonga.\n" +
                        "\nKia makinakina ki uta,\n" +
                        "Kia mataratara ki tai.\n" +
                        "\nE hi ake ana te atakura\n" +
                        "he tio, he huka, he hauhunga.\n" +
                        "\nHaumi e! Hui e! Taiki e!",
                R.raw.opening2
            )
        )
        karakiaStringList.add(
            KarakiaData(
                3,
                "E te Atua\n",
                "Blessing for food or Karakia ki te kai.\n\n"+
                        "Traditionally, Māori would say a karakia of acknowledgement and thanks to the gods of the food that they were to partake of. \n\n" +
                        "They would also offer some food to the deities or atua. \n\n" +
                        "There were also strict rules about not eating various foods together as it would cause the deities and gods to clash.\n\n" +
                        "Picture retrived from https://celtictourswv.wordpress.com/2011/01/20/maori-art-and-culture/\n\n" +
                        "Descriptions are retrieved from https://www.taiuru.maori.nz/karakia-or-cultural-appropriation/",
                R.drawable.blessing,
                "\n\nLord God\n" +
                        "Bless this food\n" +
                        "For the goodness of our bodies\n" +
                        "Feeding our spiritual needs\n" +
                        "also with " +
                        "the bread of life\n" +
                        "\nJesus Christ, our Lord\n" +
                        "For ever and ever\n" +
                        "Amen\n",
                "\n\nE te Atua\n" +
                        "Whakapainga ēnei kai\n" +
                        "Hei oranga mō ō mātou tinana\n" +
                        "Whāngaia hoki ō mātou\n" +
                        "wairua ki te taro\n" +
                        "o te ora\n" +
                        "\nKo Ihu Karaiti tō mātou Ariki\n" +
                        "Ake, ake, ake\n" +
                        "Amine",
                R.raw.blessingforfood
            )
        )
        karakiaStringList.add(
            KarakiaData(
                4,
                "Kai tau ki\n",
                "Karakia Whakamutunga/Closing prayer.\n\n" +
                        "There may not appropriate translations for the words or metaphors.\n\n" +
                        "This is a Christian Karakia\n\n" +
                        "Following the arrival of western settlers in the 1800s into the introduction of Christianity to the Maori culture many new Karakia were written to acknowledge the Christian God and Jesus Christ.\n\n" +
                        "This is a translation of 2 Corinthians 13:14\n" +
                        "2 Corinthians is New testament book\n\n" +
                        "Background retrieved from https://www.youtube.com/watch?v=LGxKAAZDfWM\n\n" +
                        "University of Otago,(n.d),Karakia-prayers, https://www.otago.ac.nz/maori/world/te-reo-maori/karakia-prayers/\n\n" +
                        "Te Puni Kōkiri Ministry of Māori development,(14/October/2020),He Karakia, https://www.tpk.govt.nz/en/mo-te-puni-kokiri/karakia/he-karakia\n\n" +
                        "biblegateway.com,(n.d),2 Corinthians 13:14, https://www.biblegateway.com/passage/?search=2%20Corinthians+13&version=NIV\n\n",
                R.drawable.closingone,
                "\n\nMay the grace of the Lord\n" +
                        " Jesus Christ\n" +
                        "\nAnd the love of God and the fellowship\n" +
                        "of the Holy Spirit Be with you all\n" +
                        "\nforever and ever,\n" +
                        "Amen",
                "\n\nKia tau ki ā tātou katoa\n" +
                        "Te atawhai o tō tātou Ariki\n" +
                        "ā Ihu Karaiti\n" +
                        "\nMe te aroha o te Atua\n" +
                        "Me te whiwhinga tahitanga\n" +
                        "Ki te Wairua Tapu\n" +
                        "\nĀke, ake, ake \n" +
                        "Āmine ",
                R.raw.closing1
            )
        )
        karakiaStringList.add(
            KarakiaData(
                5,
                "He hōnore\n" ,
                "Karakia Whakamutunga/Closing prayer.\n\n" +
                        "The words of this waiata have Biblical and Tūhoe origins. \n\n" +
                        "The words from Luke's gospel had been used in an old Ringatū karakia, and other variants have evolved from this prayer.\n\n" +
                        "In 1992 Ranui Ngarimu made use of a version of this karakia that was used by the Maori language teaching organisation Te Ataarangi Inc as an opening prayer for their students. \n\n" +
                        "She arranged the leading words of the karakia so they could be sung to a tune composed by her son Taina Piripi Ngarimu.\n\n" +
                        "Her family then sung it when they were visited by a group of tutors from Waikato Polytechnic to discuss a Te Ataarangi kaupapa. \n\n" +
                        "So it was first heard by others in Mrs Ngarimu's home on the West Coast of the South Island following her husband's mihi whakatau to their Te Ataarangi visitors.\n\n" +
                        "Background retrieved from https://www.youtube.com/watch?v=ZO0Zt1xh7pw\n\n" +
                        "Descriptions are retrieved from https://folksong.org.nz/he_honore/index.html",
                R.drawable.closingtwo,
                "\n\n\nHonour, glory and\n" +
                        "peace to the land.\n" +
                        "May good thoughts come\n" +
                        "to all men\n\n" +
                        "for ever and ever.\n" +
                        "Amen.",
                "\n\n\nHe hōnore, he korōria\n" +
                        "Maungārongo ki te whenua.\n" +
                        "Whakaaro pai e\n" +
                        "Kingā tangata katoa\n\n" +
                        "Ake, ake, ake.\n" +
                        "Āmine\n",
                R.raw.closing2
            )
        )
        return karakiaStringList
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}