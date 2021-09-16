package com.company;

public class Main {

    public static void main(String[] args) {
        String[] cards = input.split("\n");
        int mastercard = 0, visa = 0, other = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].length() == 16 && ((Integer.parseInt(cards[i].substring(0,4)) >= 2221 && Integer.parseInt(cards[i].substring(0,4)) <= 2720) || (Integer.parseInt(cards[i].substring(0,2)) >= 51 && Integer.parseInt(cards[i].substring(0,4)) >= 55))) mastercard++;
            else if ((cards[i].length() == 13 || cards[i].length() == 16 || cards[i].length() == 19) && (Integer.parseInt(cards[i].substring(0,1)) == 4)) visa++;
            else other++;
        }
        System.out.println("Amount of Visa cards: " + mastercard);
        System.out.println("Amount of MasterCard cards: " + visa);
        System.out.println("Total of all cards (ie. American Express): " + other);
    }

    static String input = "5545368952645580\n" +
            "377692405720086\n" +
            "4225461880464636\n" +
            "349817028542824\n" +
            "342011081800637\n" +
            "347480086729874\n" +
            "5192833737934050\n" +
            "349883975657791\n" +
            "5454660225458463\n" +
            "4532781916618709\n" +
            "374320292130267\n" +
            "343182238561452\n" +
            "4539609738872332\n" +
            "345814471182012\n" +
            "375231498734340\n" +
            "5290324523523498\n" +
            "4929784934926360\n" +
            "4556255825539026\n" +
            "4716321941346097\n" +
            "5542381780987861\n" +
            "4485781243808731\n" +
            "374367476775557\n" +
            "377607700313882\n" +
            "343386227869343\n" +
            "340070979960368\n" +
            "349469181553071\n" +
            "5165981208641218\n" +
            "4929940628036086\n" +
            "4024007174992098\n" +
            "4929758101696436\n" +
            "4716485524324282\n" +
            "4485272447114688\n" +
            "4409014336469648\n" +
            "5417032482672804\n" +
            "4716422329558319\n" +
            "345898783808059\n" +
            "4934313921440632\n" +
            "4024007149703349\n" +
            "5303081595961056\n" +
            "5288244858014315\n" +
            "4929487227261764\n" +
            "5165388458661666\n" +
            "5119332577233756\n" +
            "5196415413396865\n" +
            "374223612700175\n" +
            "5196406898852589\n" +
            "4556703940635435\n" +
            "5199500595762070\n" +
            "375374688502893\n" +
            "349007450102590\n" +
            "4916306295758524\n" +
            "5361370662857043\n" +
            "5577007704153029\n" +
            "4539311003064188\n" +
            "5238632787141764\n" +
            "340068545310480\n" +
            "5431920624370463\n" +
            "5143514000319357\n" +
            "4929895361322327\n" +
            "378074127545225\n" +
            "377248301580171\n" +
            "373732923981168\n" +
            "378030968145012\n" +
            "5402201054381394\n" +
            "371584449900277\n" +
            "349277610225017\n" +
            "5274798552178201\n" +
            "4716917594640734\n" +
            "375854761961017\n" +
            "377456165574681\n" +
            "4539736349302746\n" +
            "378109118858888\n" +
            "5331890631575357\n" +
            "5472727826973212\n" +
            "5181843027129157\n" +
            "5426090667276527\n" +
            "379732884874729\n" +
            "5230567088578058\n" +
            "5207406272614149\n" +
            "5481619312172368\n" +
            "345162408859926\n" +
            "4024007123208224\n" +
            "376268837486702\n" +
            "4556984693918836\n" +
            "5539463984048206\n" +
            "5189793025592835\n" +
            "4929170643264063\n" +
            "4485641699700099\n" +
            "4532141600320528\n" +
            "4929450947038359\n" +
            "349530369630674\n" +
            "371946606220569\n" +
            "4916790537747322\n" +
            "340418045367995\n" +
            "374714328022300\n" +
            "5436895183294277\n" +
            "4929728079662264\n" +
            "4716869916333557\n" +
            "5447192330812483\n" +
            "374502977699795\n" +
            "5369658482086732\n" +
            "5517308146085206\n" +
            "344124470758684\n" +
            "4539086517467859\n" +
            "4929423896977174\n" +
            "5108697842717343\n" +
            "5461999939848960\n" +
            "374146024631219\n" +
            "5478328269260722\n" +
            "5582855966232201\n" +
            "5293498001379222\n" +
            "4539730982462222\n" +
            "5421273120875201\n" +
            "372973671052122\n" +
            "4934190018549669\n" +
            "4033247531994465\n" +
            "4024007134728137\n" +
            "5202607945459045\n" +
            "5391301696627734\n" +
            "4532327561776135\n" +
            "346714478625410\n" +
            "5446203852214080\n" +
            "346227551526496\n" +
            "378788955682046\n" +
            "4716014568335390\n" +
            "378069220445331\n" +
            "372029998532765\n" +
            "343815579751048\n" +
            "5282704007135200\n" +
            "345922034936848\n" +
            "4716197335815230\n" +
            "5116214697701768\n" +
            "341671634489179\n" +
            "4605309745295754\n" +
            "372717854484820\n" +
            "347791640194045\n" +
            "5285986447676524\n" +
            "349137017147000\n" +
            "373727978435441\n" +
            "374425890975235\n" +
            "4556667903920516\n" +
            "5500518228015678\n" +
            "346195445464366\n" +
            "374218634927608\n" +
            "374049004767930\n" +
            "4485302017776341\n" +
            "4556525730244890\n" +
            "4929168017452835\n" +
            "371465478940576\n" +
            "4539811732424173\n" +
            "5473872915055866\n" +
            "343399782879912\n" +
            "5392462344784209\n" +
            "5466617605646808\n" +
            "344313418804938\n" +
            "4485162388483657\n" +
            "375108631825575\n" +
            "376285515125907\n" +
            "376281397560121\n" +
            "4024007138619050\n" +
            "4485022519986517\n" +
            "348457987201392\n" +
            "5437348036297443\n" +
            "340438315815598\n" +
            "5176070613657873\n" +
            "5466353321774514\n" +
            "4716689347758135\n" +
            "372564748608622\n" +
            "4929359789362803\n" +
            "5519656731280998\n" +
            "5260255637977079\n" +
            "375596775731734\n" +
            "4485947863284665\n" +
            "5387873790915252\n" +
            "5163997194637558\n" +
            "4485607442490791\n" +
            "5215050395077741\n" +
            "5110542048707183\n" +
            "341434064696114\n" +
            "349141791467881\n" +
            "4532483561867554\n" +
            "5124188137085877\n" +
            "344341156263546\n" +
            "5486830260427804\n" +
            "4716521745599615\n" +
            "4716453455051894\n" +
            "5457733814353754\n" +
            "5579598081548441\n" +
            "374254872152989\n" +
            "372472922366886\n" +
            "349667714505316\n" +
            "5359745350170565\n" +
            "4556751282449204\n" +
            "376902232141641\n" +
            "5208224412869641\n" +
            "340286527231751\n" +
            "370038558669117\n" +
            "5302990508580699\n" +
            "5546134011211171\n" +
            "340202340390260\n" +
            "377467950244299\n" +
            "5362146512702160\n" +
            "4556150056243226\n" +
            "344380214070501\n" +
            "5509982806283556\n" +
            "372716221299499\n" +
            "5101140191312827\n" +
            "5279462228311895\n" +
            "5520463365693886\n" +
            "4556589759806351\n" +
            "373141617006433\n" +
            "5590716566793457\n" +
            "4532071792767816\n" +
            "5527266574166955\n" +
            "5128561735440155\n" +
            "345003356020485\n" +
            "4485854693513943\n" +
            "5153941041912428\n" +
            "341585819351451\n" +
            "343038300065477\n" +
            "5553211087175595\n" +
            "4556907896509409\n" +
            "4532884723979379\n" +
            "4716443747211273\n" +
            "5523704967147871\n" +
            "347260893585226\n" +
            "4024007183443810\n" +
            "342113918160738\n" +
            "343982787491526\n" +
            "4556968256235605\n" +
            "4539357857658286\n" +
            "372373173146680\n" +
            "4485074550243449\n" +
            "374776128503003\n" +
            "4556472527930433\n" +
            "343340806866386\n" +
            "4682971886610715\n" +
            "4539342190582609\n" +
            "377882727484913\n" +
            "4485366690130027\n" +
            "4556066853426188\n" +
            "370120495588780\n" +
            "4201971502264477\n" +
            "346868327834183\n" +
            "373419837985960\n" +
            "4716002825757696\n" +
            "343986993309687\n" +
            "5230690016296237\n" +
            "346407509579348\n" +
            "4929754248474548\n" +
            "5332062872048317\n" +
            "4532786867150636\n" +
            "5408238562914013\n" +
            "4929238512478153\n" +
            "4024007193715421\n" +
            "4899067431160840\n" +
            "5210594550424516\n" +
            "5224141552623598\n" +
            "4539128869183047\n" +
            "5359447202834569\n" +
            "4804024991431826\n" +
            "374600716778118\n" +
            "5541981505092771\n" +
            "377460858269526\n" +
            "4929007375394157\n" +
            "5544700944898078\n" +
            "349939450651244\n" +
            "342289483902355\n" +
            "4929740140096026\n" +
            "346076010044488\n" +
            "4532102864324077\n" +
            "4485992039471788\n" +
            "379207633030337\n";
}
